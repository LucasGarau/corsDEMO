package com.liceu.filters;

import javax.servlet.annotation.WebFilter;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

@WebFilter(filterName = "com.liceu.filters.Filter2")
public class Filter2 implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
