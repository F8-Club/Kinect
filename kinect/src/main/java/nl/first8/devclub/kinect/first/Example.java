package nl.first8.devclub.kinect.first;

import org.openkinect.freenect.Context;
import org.openkinect.freenect.Freenect;

public class Example {
	private Context context;

	public static void main(String[] args) {
		Example e = new Example();
		e.start();
	}

	public void start() {
		context = Freenect.createContext();
		System.err.println("numdevices: " + context.numDevices());
	}

	protected Context getContext() {
		return context;
	}
}
