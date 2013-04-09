package org.squirrelframework.foundation.fsm.builder;

import org.squirrelframework.foundation.fsm.StateMachine;

public interface From<T extends StateMachine<T, S, E, C>, S, E, C> {
    To<T, S, E, C> to(S stateId);
    To<T, S, E, C> toFinal(S stateId);
}
