package sth.app.person;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Display;
import sth.core.SchoolManager;

/**
 * 4.2.1. Show person.
 */
public class DoShowPerson extends Command<SchoolManager> {

    /**
    * @param receiver
    */
    public DoShowPerson(SchoolManager receiver) {
        super(Label.SHOW_PERSON, receiver);
    }

    /** @see pt.tecnico.po.ui.Command#execute() */
    @Override
    public final void execute() {

        String user = _receiver.showPerson();

        if (user != null) {
            _display.addLine(user);
            _display.display();
        }
    }
}
