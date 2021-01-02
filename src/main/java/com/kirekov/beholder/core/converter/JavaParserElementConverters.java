package com.kirekov.beholder.core.converter;

import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.kirekov.beholder.core.element.constructor.ConstructorElement;
import com.kirekov.beholder.core.element.method.FunctionElement;
import com.kirekov.beholder.core.element.method.ProcedureElement;

public interface JavaParserElementConverters {
    ElementConverter<ConstructorDeclaration, ConstructorElement> constructorElementConverter();

    ElementConverter<MethodDeclaration, FunctionElement> functionElementConverter();

    ElementConverter<MethodDeclaration, ProcedureElement> procedureElementConverter();
}
