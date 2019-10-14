package com.tzx.build;

public abstract class Builder {
    public abstract void buildName();
    public abstract void buildAge();
    public abstract void builHeight();
    public abstract void buildWeight();
    public abstract Person create();
}
