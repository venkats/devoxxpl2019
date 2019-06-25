package com.agiledeveloper

class Counter(val value: Int) {
  operator fun inc() = Counter(value + 1)
  
  operator fun dec() = Counter(if(value > 0) value - 1 else value)
  
  init {
    if(value < 0) throw RuntimeException("invalid value")
  }
}