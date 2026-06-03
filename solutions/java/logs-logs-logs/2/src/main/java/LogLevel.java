public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("", 0);

    private final String shortLogString;

    private final int shortLogInteger;

    LogLevel(String shortLogString, int shortLogInteger) {
        this.shortLogInteger = shortLogInteger;
        this.shortLogString = shortLogString;
    }

    public int getShortLogInteger() {
        return shortLogInteger;
    }

    public String getShortLogString() {
        return shortLogString;
    }

    public static LogLevel fromShortLogString(String shortLogString) {
        for (LogLevel logLevel : LogLevel.values()) {
            if (logLevel.getShortLogString().equals(shortLogString)) {
                return logLevel;
            }
        }
        return UNKNOWN;
    }
}