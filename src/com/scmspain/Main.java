package com.scmspain;

import java.sql.SQLException;

public class Main<T extends Exception> {

  private static Main<RuntimeException> main = new Main<RuntimeException>();

  public static void main(String[] args) {
    try{
      main.pleasethrow(new SQLException());
    }catch(SQLException e){
      e.printStackTrace();
    }
  }

  private void pleasethrow(final Exception e)throws T{
    throw (T) e;
  }
}
