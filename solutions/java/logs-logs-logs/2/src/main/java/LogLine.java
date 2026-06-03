public class LogLine {

    public String LogString;
    public String shortLogString;
    public String message;
    public LogLevel logLevel;

    public LogLine(String cadena) {
        this.LogString = cadena;
    }

    public String logLevelShortString() {
        return this.shortLogString = LogString.substring(1, 4);
    }

    public String getMessage() {
        return this.message = LogString.substring(7);
    }

    public LogLevel getLogLevel() {
        logLevelShortString();
        logLevel = logLevel.fromShortLogString(shortLogString);
        return logLevel;
    }

    public String getOutputForShortLog() {
        logLevelShortString();
        getLogLevel();
        getMessage();
        return  logLevel.getShortLogInteger() + ":" + this.message;
    }
}