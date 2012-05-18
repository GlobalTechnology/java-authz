package org.ccci.gto.authorization;

import org.ccci.gto.authorization.exception.ProcessingException;

public interface Controller {
    public Commands process(final Commands commands) throws ProcessingException;
}
