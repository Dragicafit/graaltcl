/*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
 * Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.
 */

proc main{} {
  set i 0
  while {i < 1000} {
    if {i >= 942} {
      break
    }  
    set i [expr {$i + 1}]
  }
  return i
}  
