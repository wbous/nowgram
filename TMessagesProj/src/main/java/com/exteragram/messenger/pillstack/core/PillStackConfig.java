package com.exteragram.messenger.pillstack.core;

import java.util.ArrayList;

public final class PillStackConfig {
    private PillStackConfig() {
    }

    public static ArrayList<Integer> getActivePills() {
        app.nowgram.pillstack.PillStackConfig.loadConfig(false);
        return app.nowgram.pillstack.PillStackConfig.getActivePills();
    }

    public static ArrayList<Integer> getHiddenPills() {
        app.nowgram.pillstack.PillStackConfig.loadConfig(false);
        return app.nowgram.pillstack.PillStackConfig.getHiddenPills();
    }

    public static int getLastActivePillId() {
        app.nowgram.pillstack.PillStackConfig.loadConfig(false);
        return app.nowgram.pillstack.PillStackConfig.lastActivePillId.Int();
    }
}
