/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class exampleJNI {
  public final static native void delete_Shape(long jarg1);
  public final static native void Shape_x_set(long jarg1, Shape jarg1_, double jarg2);
  public final static native double Shape_x_get(long jarg1, Shape jarg1_);
  public final static native void Shape_y_set(long jarg1, Shape jarg1_, double jarg2);
  public final static native double Shape_y_get(long jarg1, Shape jarg1_);
  public final static native void Shape_move(long jarg1, Shape jarg1_, double jarg2, double jarg3);
  public final static native double Shape_area(long jarg1, Shape jarg1_);
  public final static native double Shape_perimeter(long jarg1, Shape jarg1_);
  public final static native void Shape_nshapes_set(int jarg1);
  public final static native int Shape_nshapes_get();
  public final static native long new_Circle(double jarg1);
  public final static native double Circle_area(long jarg1, Circle jarg1_);
  public final static native double Circle_perimeter(long jarg1, Circle jarg1_);
  public final static native void delete_Circle(long jarg1);
  public final static native long new_Square(double jarg1);
  public final static native double Square_area(long jarg1, Square jarg1_);
  public final static native double Square_perimeter(long jarg1, Square jarg1_);
  public final static native void delete_Square(long jarg1);
  public final static native long Circle_SWIGUpcast(long jarg1);
  public final static native long Square_SWIGUpcast(long jarg1);
}
