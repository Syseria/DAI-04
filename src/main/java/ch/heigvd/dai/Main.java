package ch.heigvd.dai;

import ch.heigvd.dai.commands.Goodbye;
import ch.heigvd.dai.commands.Hello;
import java.io.File;
import picocli.CommandLine;

@CommandLine.Command(
    description = "A small CLI with subcommands to demonstrate picocli.",
    version = "1.0.0",
    subcommands = {
      Hello.class,
      Goodbye.class,
    },
    scope = CommandLine.ScopeType.INHERIT,
    mixinStandardHelpOptions = true)
public class Main {

  @CommandLine.Parameters(
      index = "0",
      description = "The name of the user (default: World).",
      defaultValue = "World")
  protected String name;

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    String jarFilename =
        new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath())
            .getName();

    int exitCode = new CommandLine(new Main()).setCommandName(jarFilename).execute(args);

    System.exit(exitCode);
  }
}
