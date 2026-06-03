public class LogLine {

    public String cadena;
    public String level;
    public String message;

    public LogLine(String cadena) {
        this.cadena = cadena;
    }

    public String logLevel() {
       return this.level = cadena.substring(1, 4);
    }

    public String getMessage() {
        return this.message = cadena.substring(7);
    }

    public LogLevel getLogLevel() {
        logLevel();

        switch (level) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        logLevel();
        getMessage();
        int shortLog = 0;

        switch (level) {
            case "TRC":
                shortLog = 1;
                break;
            case "DBG":
                shortLog = 2;
                break;
            case "INF":
                shortLog = 4;
                break;
            case "WRN":
                shortLog = 5;
                break;
            case "ERR":
                shortLog = 6;
                break;
            case "FTL":
                shortLog = 42;
                break;
            default:
                shortLog = 0;
                break;
        }
        return shortLog + ":" + this.message;
    }
}
