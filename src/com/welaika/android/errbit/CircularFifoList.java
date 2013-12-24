package com.welaika.android.errbit;

import java.util.ArrayList;
import java.util.List;

public class CircularFifoList<E> extends ArrayList<E> {

  public CircularFifoList(int maxSize) {
    super(maxSize);
  }

  @Override
  public boolean add(E object) {
    super.add(0,object);
    return true;
  }
}
