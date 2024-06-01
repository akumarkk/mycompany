package com.penguin;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ScriptEngineManager manager = new ScriptEngineManager();
        for (ScriptEngineFactory factory : manager.getEngineFactories()) {
            System.out.println("Engine Name: " + factory.getEngineName());
            System.out.println("Engine Version: " + factory.getEngineVersion());
            System.out.println("Language Name: " + factory.getLanguageName());
            System.out.println("Language Version: " + factory.getLanguageVersion());
            System.out.println("Engine Names: " + factory.getNames());
            System.out.println("----------------------------------------");
        }
        System.out.println( "bye!" );
    }
}
