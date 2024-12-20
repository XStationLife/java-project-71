package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;


@Command(name = "gendiff",
        description = "Compares two configuration files and shows a difference.")
public class App implements Runnable {

    public static void main(String[] args) {
        new CommandLine(new App()).execute(args);
    }

    @Option(names = {"-h", "--help"}, description = "Show this help message and exit.")
    private Boolean help;

    @Option(names = {"-v", "--version"}, description = "Print version information and exit.")
    private Boolean version;

    @Override
    public void run() {
            CommandLine.usage(this, System.out);
    }
}
