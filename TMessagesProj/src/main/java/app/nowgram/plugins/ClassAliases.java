package app.nowgram.plugins;

public final class ClassAliases {

    public static final String ROOT = "com.exteragram.messenger";

    public static final String MEDIA_ROOT = "com.google.android.exoplayer2";

    private static final String[] ROOTS = {ROOT, MEDIA_ROOT};

    private static final String[][] EXACT = {
            {"com.exteragram.messenger.utils.chats.ChatUtils", "com.exteragram.messenger.utils.chats.ChatUtils"},
            {"com.exteragram.messenger.utils.ChatUtils", "com.exteragram.messenger.utils.chats.ChatUtils"},
            {"com.exteragram.messenger.utils.text.LocaleUtils", "com.exteragram.messenger.utils.text.LocaleUtils"},
            {"com.exteragram.messenger.utils.LocaleUtils", "com.exteragram.messenger.utils.text.LocaleUtils"},
            {"com.exteragram.messenger.utils.AppUtils", "com.exteragram.messenger.utils.AppUtils"},
            {"com.exteragram.messenger.R", "org.telegram.messenger.R"},
            {"com.exteragram.messenger.utils.system.VibratorUtils", "com.exteragram.messenger.utils.system.VibratorUtils"},
            {"com.exteragram.messenger.ai.AiConfig", "app.nowgram.ai.AiConfig"},
            {"com.exteragram.messenger.ai.AiController", "com.exteragram.messenger.ai.AiController"},
            {"com.exteragram.messenger.ai.ui.ResponseAlert", "com.exteragram.messenger.ai.ui.ResponseAlert"},
            {"com.exteragram.messenger.ai.ui.GenerateFromMessageBottomSheet", "com.exteragram.messenger.ai.ui.GenerateFromMessageBottomSheet"},
            {"com.exteragram.messenger.plugins.ui.components.InstallPluginBottomSheet", "com.exteragram.messenger.plugins.ui.components.InstallPluginBottomSheet"},
            {"com.exteragram.messenger.utils.system.SystemUtils", "com.exteragram.messenger.utils.system.SystemUtils"},
            {"com.exteragram.messenger.utils.SystemUtils", "com.exteragram.messenger.utils.system.SystemUtils"},
            {"com.exteragram.messenger.preferences.MainPreferencesActivity", "app.nowgram.settings.OpenExteraSettingsActivity"},
            {"com.exteragram.messenger.preferences.GeneralPreferencesActivity", "app.nowgram.settings.OpenExteraGeneralActivity"},
            {"com.exteragram.messenger.preferences.AppearancePreferencesActivity", "app.nowgram.settings.OpenExteraAppearanceActivity"},
            {"com.exteragram.messenger.preferences.ChatsPreferencesActivity", "app.nowgram.settings.OpenExteraChatsActivity"},
            {"com.exteragram.messenger.preferences.OtherPreferencesActivity", "app.nowgram.settings.OpenExteraOtherActivity"},
            {"com.exteragram.messenger.preferences.AppNavigationPreferencesActivity", "app.nowgram.settings.OpenExteraAppNavigationActivity"},
            {"com.exteragram.messenger.preferences.BasePreferencesActivity", "com.exteragram.messenger.preferences.BasePreferencesActivity"},
            {"com.exteragram.messenger.preferences.components.AltSeekbar", "app.nowgram.appearance.AltSeekbar"},
            {"com.exteragram.messenger.utils.chats.MainMenuHelper", "app.nowgram.drawer.MainMenuHelper"},
            {"com.exteragram.messenger.icons.ui.IconPacksActivity", "app.nowgram.icons.IconPacksActivity"},
            {"com.exteragram.messenger.pillstack.ui.pills.crypto.utils.ColoredBackground", "app.nowgram.pillstack.pills.ColoredBackground"},
            {"com.exteragram.messenger.pillstack.ui.pills.weather.WeatherPill", "app.nowgram.pillstack.pills.WeatherPill"},
            {"com.exteragram.messenger.pillstack.ui.PillStackPreferencesActivity", "app.nowgram.pillstack.PillStackSettingsActivity"},
            {"com.exteragram.messenger.pillstack.ui.PillStackLayout", "app.nowgram.pillstack.PillStackView"},
            {"com.exteragram.messenger.pillstack.ui.pills.weather.WeatherPreferencesActivity", "app.nowgram.pillstack.pills.weather.WeatherSettingsActivity"},
            {"com.exteragram.messenger.preferences.appearance.AppearancePreferencesActivity", "app.nowgram.settings.OpenExteraAppearanceActivity"},
            {"com.exteragram.messenger.nowplaying.ui.components.NowPlayingCard", "app.nowgram.components.ProfileMusicCard"},
            {"com.exteragram.messenger.nowplaying.NowPlayingController", "app.nowgram.nowplaying.NowPlayingController"},
            {"com.exteragram.messenger.proxy.ProxyController", "app.nowgram.proxy.ProxyController"},
            {"com.exteragram.messenger.utils.ui.UIUtil", "app.nowgram.utils.UIUtil"},
            {"com.exteragram.messenger.utils.ui.MainTabsUiHelper", "app.nowgram.appearance.MainTabsUiHelper"},
            {"com.google.android.exoplayer2.util.Consumer", "androidx.media3.common.util.Consumer"},
            {"com.google.android.exoplayer2.video.VideoSize", "androidx.media3.common.VideoSize"},
            {"com.google.android.exoplayer2.PlaybackException", "androidx.media3.common.PlaybackException"},
            {"com.google.android.exoplayer2.PlaybackParameters", "androidx.media3.common.PlaybackParameters"},
            {"com.google.android.exoplayer2.C", "androidx.media3.common.C"},
            {"org.telegram.ui.Gifts.ProfileGiftsContainer$SelectGiftsBottomSheet", "org.telegram.ui.Gifts.SelectGiftsBottomSheet"},
    };

    private static final String[][] PREFIXES = {
            {"com.exteragram.messenger.ai.data.", "app.nowgram.ai.data."},
            {"com.exteragram.messenger.ai.network.", "app.nowgram.ai.network."},
            {"com.exteragram.messenger.pillstack.core.", "app.nowgram.pillstack."},
            {"com.exteragram.messenger.pillstack.ui.pills.", "app.nowgram.pillstack.pills."},
            {"com.exteragram.messenger.pillstack.ui.", "app.nowgram.pillstack."},
            {"com.exteragram.messenger.preferences.", "app.nowgram.settings."},
            {"com.exteragram.messenger.plugins.", "app.nowgram.plugins."},
            {"com.exteragram.messenger.icons.", "app.nowgram.icons."},
            {"com.exteragram.messenger.camera.", "app.nowgram.camera."},
            {"com.exteragram.messenger.backup.", "app.nowgram.backup."},
            {"com.exteragram.messenger.feed.", "app.nowgram.feed."},
            {"com.exteragram.messenger.drawer.", "app.nowgram.drawer."},
            {"com.exteragram.messenger.components.", "app.nowgram.components."},
            {"com.exteragram.messenger.utils.", "app.nowgram.utils."},
    };

    private ClassAliases() {
    }

    public static String resolve(String name) {
        if (name == null) {
            return null;
        }
        String exact = lookup(name);
        if (exact != null) {
            return exact;
        }
        if (!underRoot(name)) {
            return name;
        }
        int dollar = name.indexOf('$');
        String outer = dollar < 0 ? name : name.substring(0, dollar);
        String nested = dollar < 0 ? "" : name.substring(dollar);
        exact = lookup(outer);
        if (exact != null) {
            return exact + nested;
        }
        for (String[] pair : PREFIXES) {
            if (outer.startsWith(pair[0])) {
                return pair[1] + outer.substring(pair[0].length()) + nested;
            }
        }
        return name;
    }

    private static boolean underRoot(String name) {
        for (String root : ROOTS) {
            if (name.startsWith(root + ".")) {
                return true;
            }
        }
        return false;
    }

    private static String lookup(String name) {
        for (String[] pair : EXACT) {
            if (pair[0].equals(name)) {
                return pair[1];
            }
        }
        return null;
    }
}
