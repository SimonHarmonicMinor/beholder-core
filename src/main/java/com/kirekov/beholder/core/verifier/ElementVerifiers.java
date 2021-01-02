package com.kirekov.beholder.core.verifier;

import com.kirekov.beholder.core.element.constructor.ConstructorElement;
import com.kirekov.beholder.core.element.method.FunctionElement;
import com.kirekov.beholder.core.element.method.ProcedureElement;

public interface ElementVerifiers {
    ElementVerifier<ConstructorElement> constructorElementVerifier();

    ElementVerifier<FunctionElement> functionElementVerifier();

    ElementVerifier<ProcedureElement> procedureElementVerifier();
}
