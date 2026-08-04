package com.rk.utils

const val DEFAULT_EDITOR_FONT_PATH = "fonts/SourceCodePro-Medium.ttf"
const val DEFAULT_TERMINAL_FONT_PATH = "fonts/SourceCodePro-Medium.ttf"
const val DEFAULT_APP_FONT_PATH = "fonts/Outfit-Regular.ttf"

const val DEFAULT_EXTRA_KEYS_COMMANDS =
    "global.command_palette|editor.emulate_key.tab|editor.emulate_key.shift|editor.emulate_key.dpad_left|editor.emulate_key.dpad_up|editor.emulate_key.dpad_right|editor.emulate_key.dpad_down"
const val DEFAULT_EXTRA_KEYS_SYMBOLS = "()\"{}[];"

val DEFAULT_EXCLUDED_FILES_DRAWER = listOf("**/.git", "**/.svn", "**/.hg", "**/.DS_Store", "**/Thumbs.db")

val DEFAULT_EXCLUDED_FILES_SEARCH =
    listOf(
        "**/node_modules/**",
        "**/bower_components/**",
        "**/jspm_packages/**",
        "**/.npm/**",
        "**/flow-typed/**",
        "**/vendor/**",
        "**/composer/**",
        "**/venv/**",
        "**/.virtualenv/**",
        "**/__pycache__/**",
        "**/.pytest_cache/**",
        "**/.eggs/**",
        "**/*.egg-info/**",
        "**/.git/**",
        "**/.svn/**",
        "**/.hg/**",
        "**/.vscode/**",
        "**/.idea/**",
        "**/.vs/**",
        "**/.project/**",
        "**/.settings/**",
        "**/.classpath/**",
        "**/dist/**",
        "**/build/**",
        "**/out/**",
        "**/target/**",
        "**/bin/**",
        "**/obj/**",
        "**/coverage/**",
        "**/.nyc_output/**",
        "**/htmlcov/**",
        "**/temp/**",
        "**/tmp/**",
        "**/.cache/**",
        "**/logs/**",
        "**/.sass-cache/**",
        "**/.DS_Store/**",
        "**/Thumbs.db/**",
    )
