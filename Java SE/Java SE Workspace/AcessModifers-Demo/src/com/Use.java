package com;

public class Use {
	
    void test() {  }  // default
    public void f1() {}
    private void f2() {}
    protected void f3() {} 

	public static void main(String[] args) {
		Use u=new Use();
		u.f2();
	}

}
