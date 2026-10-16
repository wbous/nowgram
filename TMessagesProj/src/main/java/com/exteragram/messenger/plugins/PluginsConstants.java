package com.exteragram.messenger.plugins;

/**
 * Шим строковых констант exteraGram. Значения — те же, что в
 * {@code com.exteragram.messenger.plugins.PluginsConstants} 12.9.0, а не наши
 * внутренние: плагин сравнивает их с тем, что приходит из SDK.
 */
public final class PluginsConstants {

    public static final String PYTHON = app.nowgram.plugins.PluginsConstants.PYTHON;
    public static final String SEND_MESSAGE_HOOK = app.nowgram.plugins.PluginsConstants.SEND_MESSAGE_HOOK;
    public static final String STRATEGY = app.nowgram.plugins.PluginsConstants.STRATEGY;
    public static final String PARAMS = app.nowgram.plugins.PluginsConstants.PARAMS;
    public static final String UPDATE = app.nowgram.plugins.PluginsConstants.UPDATE;
    public static final String UPDATES = app.nowgram.plugins.PluginsConstants.UPDATES;
    public static final String REQUEST = app.nowgram.plugins.PluginsConstants.REQUEST;
    public static final String RESPONSE = app.nowgram.plugins.PluginsConstants.RESPONSE;
    public static final String ERROR = app.nowgram.plugins.PluginsConstants.ERROR;
    public static final String PLUGINS = app.nowgram.plugins.PluginsConstants.PLUGINS;
    public static final String PLUGINS_EXT = app.nowgram.plugins.PluginsConstants.PLUGINS_EXT;
    public static final String PLUGINS_SDK = app.nowgram.plugins.PluginsConstants.PLUGINS_SDK;
    public static final String CREATE_SETTINGS = app.nowgram.plugins.PluginsConstants.CREATE_SETTINGS;
    public static final String APP_START = app.nowgram.plugins.PluginsConstants.APP_START;
    public static final String APP_STOP = app.nowgram.plugins.PluginsConstants.APP_STOP;
    public static final String APP_PAUSE = app.nowgram.plugins.PluginsConstants.APP_PAUSE;
    public static final String APP_RESUME = app.nowgram.plugins.PluginsConstants.APP_RESUME;
    public static final String ON_APP_EVENT = app.nowgram.plugins.PluginsConstants.ON_APP_EVENT;
    public static final String ON_PLUGIN_LOAD = app.nowgram.plugins.PluginsConstants.ON_PLUGIN_LOAD;
    public static final String ON_PLUGIN_UNLOAD = app.nowgram.plugins.PluginsConstants.ON_PLUGIN_UNLOAD;

    private PluginsConstants() {
    }

    public static final class Settings {
        public static final String TYPE = app.nowgram.plugins.PluginsConstants.Settings.TYPE;
        public static final String KEY = app.nowgram.plugins.PluginsConstants.Settings.KEY;
        public static final String TEXT = app.nowgram.plugins.PluginsConstants.Settings.TEXT;
        public static final String SUBTEXT = app.nowgram.plugins.PluginsConstants.Settings.SUBTEXT;
        public static final String ICON = app.nowgram.plugins.PluginsConstants.Settings.ICON;
        public static final String ACCENT = app.nowgram.plugins.PluginsConstants.Settings.ACCENT;
        public static final String RED = app.nowgram.plugins.PluginsConstants.Settings.RED;
        public static final String ON_CLICK = app.nowgram.plugins.PluginsConstants.Settings.ON_CLICK;
        public static final String DEFAULT = app.nowgram.plugins.PluginsConstants.Settings.DEFAULT;
        public static final String ITEMS = app.nowgram.plugins.PluginsConstants.Settings.ITEMS;
        public static final String HINT = app.nowgram.plugins.PluginsConstants.Settings.HINT;
        public static final String MULTILINE = app.nowgram.plugins.PluginsConstants.Settings.MULTILINE;
        public static final String MAX_LENGTH = app.nowgram.plugins.PluginsConstants.Settings.MAX_LENGTH;
        public static final String MASK = app.nowgram.plugins.PluginsConstants.Settings.MASK;
        public static final String ON_CHANGE = app.nowgram.plugins.PluginsConstants.Settings.ON_CHANGE;
        public static final String TYPE_SWITCH = app.nowgram.plugins.PluginsConstants.Settings.TYPE_SWITCH;
        public static final String TYPE_INPUT = app.nowgram.plugins.PluginsConstants.Settings.TYPE_INPUT;
        public static final String TYPE_SELECTOR = app.nowgram.plugins.PluginsConstants.Settings.TYPE_SELECTOR;
        public static final String TYPE_HEADER = app.nowgram.plugins.PluginsConstants.Settings.TYPE_HEADER;
        public static final String TYPE_DIVIDER = app.nowgram.plugins.PluginsConstants.Settings.TYPE_DIVIDER;
        public static final String TYPE_TEXT = app.nowgram.plugins.PluginsConstants.Settings.TYPE_TEXT;
        public static final String TYPE_EDIT_TEXT = app.nowgram.plugins.PluginsConstants.Settings.TYPE_EDIT_TEXT;
        public static final String TYPE_CUSTOM = app.nowgram.plugins.PluginsConstants.Settings.TYPE_CUSTOM;
        public static final String VIEW = app.nowgram.plugins.PluginsConstants.Settings.VIEW;
        public static final String ITEM = app.nowgram.plugins.PluginsConstants.Settings.ITEM;
        public static final String FACTORY = app.nowgram.plugins.PluginsConstants.Settings.FACTORY;
        public static final String FACTORY_ARGS = app.nowgram.plugins.PluginsConstants.Settings.FACTORY_ARGS;
        public static final String CREATE_SUB_FRAGMENT = app.nowgram.plugins.PluginsConstants.Settings.CREATE_SUB_FRAGMENT;
        public static final String ON_LONG_CLICK = app.nowgram.plugins.PluginsConstants.Settings.ON_LONG_CLICK;
        public static final String LINK_ALIAS = app.nowgram.plugins.PluginsConstants.Settings.LINK_ALIAS;

        private Settings() {
        }
    }

    public static final class Strategy {
        public static final String MODIFY = app.nowgram.plugins.PluginsConstants.Strategy.MODIFY;
        public static final String CANCEL = app.nowgram.plugins.PluginsConstants.Strategy.CANCEL;
        public static final String DEFAULT = app.nowgram.plugins.PluginsConstants.Strategy.DEFAULT;
        public static final String MODIFY_FINAL = app.nowgram.plugins.PluginsConstants.Strategy.MODIFY_FINAL;

        private Strategy() {
        }
    }

    public static final class Xposed {
        public static final String REPLACE_HOOKED_METHOD = app.nowgram.plugins.PluginsConstants.Xposed.REPLACE_HOOKED_METHOD;
        public static final String BEFORE_HOOKED_METHOD = app.nowgram.plugins.PluginsConstants.Xposed.BEFORE_HOOKED_METHOD;
        public static final String AFTER_HOOKED_METHOD = app.nowgram.plugins.PluginsConstants.Xposed.AFTER_HOOKED_METHOD;
        public static final String HOOK_FILTERS = app.nowgram.plugins.PluginsConstants.Xposed.HOOK_FILTERS;

        private Xposed() {
        }
    }

    public static final class DevServer {
        public static final String MODULE = app.nowgram.plugins.PluginsConstants.DevServer.MODULE;
        public static final String CLASS = app.nowgram.plugins.PluginsConstants.DevServer.CLASS;
        public static final String START_SERVER = app.nowgram.plugins.PluginsConstants.DevServer.START_SERVER;
        public static final String STOP_SERVER = app.nowgram.plugins.PluginsConstants.DevServer.STOP_SERVER;

        private DevServer() {
        }
    }

    public static final class MenuItemTypes {
        public static final String MESSAGE_CONTEXT_MENU = app.nowgram.plugins.PluginsConstants.MenuItemTypes.MESSAGE_CONTEXT_MENU;
        public static final String DRAWER_MENU = app.nowgram.plugins.PluginsConstants.MenuItemTypes.DRAWER_MENU;
        public static final String MAIN_MENU = app.nowgram.plugins.PluginsConstants.MenuItemTypes.MAIN_MENU;
        public static final String CHAT_ACTION_MENU = app.nowgram.plugins.PluginsConstants.MenuItemTypes.CHAT_ACTION_MENU;
        public static final String PROFILE_ACTION_MENU = app.nowgram.plugins.PluginsConstants.MenuItemTypes.PROFILE_ACTION_MENU;

        private MenuItemTypes() {
        }
    }

    public static final class MenuItemProperties {
        public static final String MENU_TYPE = app.nowgram.plugins.PluginsConstants.MenuItemProperties.MENU_TYPE;
        public static final String ITEM_ID = app.nowgram.plugins.PluginsConstants.MenuItemProperties.ITEM_ID;
        public static final String TEXT = app.nowgram.plugins.PluginsConstants.MenuItemProperties.TEXT;
        public static final String SUBTEXT = app.nowgram.plugins.PluginsConstants.MenuItemProperties.SUBTEXT;
        public static final String ICON = app.nowgram.plugins.PluginsConstants.MenuItemProperties.ICON;
        public static final String ON_CLICK = app.nowgram.plugins.PluginsConstants.MenuItemProperties.ON_CLICK;
        public static final String CONDITION = app.nowgram.plugins.PluginsConstants.MenuItemProperties.CONDITION;
        public static final String PRIORITY = app.nowgram.plugins.PluginsConstants.MenuItemProperties.PRIORITY;

        private MenuItemProperties() {
        }
    }

    public static final class HookFilterTypes {
        public static final String RESULT_IS_NULL = app.nowgram.plugins.PluginsConstants.HookFilterTypes.RESULT_IS_NULL;
        public static final String RESULT_IS_TRUE = app.nowgram.plugins.PluginsConstants.HookFilterTypes.RESULT_IS_TRUE;
        public static final String RESULT_IS_FALSE = app.nowgram.plugins.PluginsConstants.HookFilterTypes.RESULT_IS_FALSE;
        public static final String RESULT_NOT_NULL = app.nowgram.plugins.PluginsConstants.HookFilterTypes.RESULT_NOT_NULL;
        public static final String RESULT_IS_INSTANCE_OF = app.nowgram.plugins.PluginsConstants.HookFilterTypes.RESULT_IS_INSTANCE_OF;
        public static final String RESULT_EQUAL = app.nowgram.plugins.PluginsConstants.HookFilterTypes.RESULT_EQUAL;
        public static final String RESULT_NOT_EQUAL = app.nowgram.plugins.PluginsConstants.HookFilterTypes.RESULT_NOT_EQUAL;
        public static final String ARGUMENT_IS_NULL = app.nowgram.plugins.PluginsConstants.HookFilterTypes.ARGUMENT_IS_NULL;
        public static final String ARGUMENT_IS_TRUE = app.nowgram.plugins.PluginsConstants.HookFilterTypes.ARGUMENT_IS_TRUE;
        public static final String ARGUMENT_IS_FALSE = app.nowgram.plugins.PluginsConstants.HookFilterTypes.ARGUMENT_IS_FALSE;
        public static final String ARGUMENT_NOT_NULL = app.nowgram.plugins.PluginsConstants.HookFilterTypes.ARGUMENT_NOT_NULL;
        public static final String ARGUMENT_IS_INSTANCE_OF = app.nowgram.plugins.PluginsConstants.HookFilterTypes.ARGUMENT_IS_INSTANCE_OF;
        public static final String ARGUMENT_EQUAL = app.nowgram.plugins.PluginsConstants.HookFilterTypes.ARGUMENT_EQUAL;
        public static final String ARGUMENT_NOT_EQUAL = app.nowgram.plugins.PluginsConstants.HookFilterTypes.ARGUMENT_NOT_EQUAL;
        public static final String CONDITION = app.nowgram.plugins.PluginsConstants.HookFilterTypes.CONDITION;
        public static final String OR = app.nowgram.plugins.PluginsConstants.HookFilterTypes.OR;

        private HookFilterTypes() {
        }
    }
}
