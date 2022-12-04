package lesson8.listeners.Button;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.evaluate;
import static java.lang.String.valueOf;

public class СalculationsListener implements ActionListener  {
    private final JTextField inputField;

    public  СalculationsListener (JTextField inputField) {
        this.inputField = inputField;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String mathCalc = inputField.getText();
        try {
            inputField.setText(engine.eval(mathCalc).toString());
        } catch (ScriptException ex) {
            throw new RuntimeException(ex);
        }


    }



}
