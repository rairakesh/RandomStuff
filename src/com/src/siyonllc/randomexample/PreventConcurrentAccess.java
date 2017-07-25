/**
 * 
 */
package com.src.siyonllc.randomexample;

/**
 * @author Rakesh Rai
 *
 */
public class PreventConcurrentAccess implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PreventConcurrentAccess pca = new PreventConcurrentAccess();
		PreventConcurrentAccess pca1 = new PreventConcurrentAccess();
		PreventConcurrentAccess pca2 = new PreventConcurrentAccess();
		
		Thread t = new Thread(pca);
		t.start();
		Thread t1 = new Thread(pca1);
		t1.start();
		Thread t2 = new Thread(pca2);
		t2.start();
		
	}

	@Override
	public void run() {
		synchronize();
	}
	
	private static synchronized void synchronize(){
	//private synchronized void synchronize(){
        try {
            System.out.println(System.currentTimeMillis());
            //Without Static
            //1501007499997
            //1501007499997
            //1501007499997
            
            //With Static
            //1501007537767
            //1501007553768
            //1501007569769
            
            Thread.sleep(16000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
