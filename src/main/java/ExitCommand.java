public class ExitCommand extends Command {
    public ExitCommand(String cmd, String arguments) {
        super(cmd, arguments);
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        System.out.println("Bye. Hope to see you again soon!");
    }

    @Override
    public boolean isExit() {
        return true;
    }


}
