package org.example.Model;

import java.io.IOException;

public interface ILogger {
    void newLog(String log) throws IOException ;
    void end() throws IOException;
}
