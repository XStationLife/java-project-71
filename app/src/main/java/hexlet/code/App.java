package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.util.List;


@Command(name = "gendiff",
        description = "Compares two configuration files and shows a difference.")
public class App implements Runnable {

    public static void main(String[] args) {
        new CommandLine(new App()).execute(args);
    }

    @Parameters(description = "path to first file")
    File filepath1;

    @Parameters(description = "path to second file")
    File filepath2;

    @Option(names = { "-f", "--format" }, paramLabel = "format", description = "output format [default: stylish]")
    File archive;

    @Option(names = {"-h", "--help"}, usageHelp = true,
            description = "Show this help message and exit.")
    private Boolean help;

    @Option(names = {"-v", "--version"}, description = "Print version information and exit.")
    private Boolean version;

    @Override
    public void run() {
            CommandLine.usage(this, System.out);
    }
}
