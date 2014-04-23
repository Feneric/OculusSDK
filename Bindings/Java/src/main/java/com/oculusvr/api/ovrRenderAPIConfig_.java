package com.oculusvr.api;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : OVR_CAPI.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ovrRenderAPIConfig_ extends Structure {
  /** C type : ovrRenderAPIConfigHeader */
  public ovrRenderAPIConfigHeader_ Header;
  /** C type : uintptr_t[8] */
  public IntByReference[] PlatformData = new IntByReference[8];
  public ovrRenderAPIConfig_() {
    super();
  }
  protected List<? > getFieldOrder() {
    return Arrays.asList("Header", "PlatformData");
  }
  /**
   * @param Header C type : ovrRenderAPIConfigHeader<br>
   * @param PlatformData C type : uintptr_t[8]
   */
  public ovrRenderAPIConfig_(ovrRenderAPIConfigHeader_ Header, IntByReference PlatformData[]) {
    super();
    this.Header = Header;
    if ((PlatformData.length != this.PlatformData.length)) 
      throw new IllegalArgumentException("Wrong array size !");
    this.PlatformData = PlatformData;
  }
  public static class ByReference extends ovrRenderAPIConfig_ implements Structure.ByReference {
    
  };
  public static class ByValue extends ovrRenderAPIConfig_ implements Structure.ByValue {
    
  };
}