package de.anjaro.remote.impl;
//import javax.bluetooth.BluetoothStateException;
//import javax.bluetooth.DiscoveryAgent;
//import javax.bluetooth.LocalDevice;
//import javax.bluetooth.UUID;
//import javax.microedition.io.Connector;
//import javax.microedition.io.StreamConnection;
//import javax.microedition.io.StreamConnectionNotifier;


public class WaitThread implements Runnable{

	/** Constructor */
	public WaitThread() {
	}

	@Override
	public void run() {
		this.waitForConnection();
	}

	/** Waiting for connection from devices */
	private void waitForConnection() {
		// retrieve the local Bluetooth device object
		//		LocalDevice local = null;
		//
		//		StreamConnectionNotifier notifier;
		//		StreamConnection connection = null;

		// setup the server to listen for connection
		//		try {
		//			local = LocalDevice.getLocalDevice();
		//			local.setDiscoverable(DiscoveryAgent.GIAC);
		//
		//			final UUID uuid = new UUID("04c6093b00001000800000805f9b34fb", false);
		//			System.out.println(uuid.toString());
		//
		//			final String url = "btspp://localhost:" + uuid.toString() + ";name=RemoteBluetooth";
		//			notifier = (StreamConnectionNotifier)Connector.open(url);
		//		} catch (final BluetoothStateException e) {
		//			System.out.println("Bluetooth is not turned on.");
		//			e.printStackTrace();
		//			return;
		//		} catch (final IOException e) {
		//			e.printStackTrace();
		//			return;
		//		}

		// waiting for connection
		//		while(true) {
		//			try {
		//				System.out.println("waiting for connection...");
		//				connection = notifier.acceptAndOpen();
		//
		//				final Thread processThread = new Thread(new ProcessConnectionThread(connection));
		//				processThread.start();
		//
		//			} catch (final Exception e) {
		//				e.printStackTrace();
		//				return;
		//			}
		//		}
	}

}
