package io.swagger.reflection;

import io.swagger.annotations.media.OASSchema;

@IndirectAnnotation
public class Parent<T extends Number> {

    public T parametrizedMethod1(T arg) {
        return null;
    }

    public Long parametrizedMethod3(Integer arg) {
        return null;
    }

    public Integer parametrizedMethod4(Integer arg) {
        return null;
    }

    public Integer parametrizedMethod4(Integer arg1, Integer arg2) {
        return null;
    }

    @OASSchema(title = "test")
    public void annotationHolder() {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
