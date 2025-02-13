package xyz.yldk.mcmod.SharpLoader.Interfaces;

import com.sun.jna.Library;

import java.lang.instrument.Instrumentation;

public interface ILibrary extends Library {
    // Agent Main
    void Initialize(String args, Instrumentation inst, boolean dynamic);

    // Information
    String InfoName();
    String InfoId();
    String InfoVersion();
    int InfoVersionCode();
    int InfoVersionUpdateCode();
    String[] InfoAuthors();
    String InfoDescription();
    String InfoWebsite();
    String InfoLicense();


    // TODO: InfoDependencies Requirements
    // ...
}
