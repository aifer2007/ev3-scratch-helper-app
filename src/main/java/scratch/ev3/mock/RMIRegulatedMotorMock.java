package scratch.ev3.mock;

import java.rmi.RemoteException;

import lejos.remote.ev3.RMIRegulatedMotor;
import lejos.robotics.RegulatedMotorListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RMIRegulatedMotorMock implements RMIRegulatedMotor {

	private int speed = 380;
	private String port;
	@SuppressWarnings("unused")
	private char type;

	private static final Logger L = LoggerFactory
			.getLogger(RMIRegulatedMotorMock.class);

	public RMIRegulatedMotorMock(String portName, char motorType) {
		this.port = portName;
		this.type = motorType;
	}

	@Override
	public void addListener(RegulatedMotorListener listener)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public RegulatedMotorListener removeListener() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void stop(boolean immediateReturn) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void flt(boolean immediateReturn) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void waitComplete() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate(int angle, boolean immediateReturn)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate(int angle) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotateTo(int limitAngle) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotateTo(int limitAngle, boolean immediateReturn)
			throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLimitAngle() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSpeed(int speed) throws RemoteException {
		this.speed = speed;
	}

	@Override
	public int getSpeed() throws RemoteException {
		return speed;
	}

	@Override
	public float getMaxSpeed() throws RemoteException {
		return 700;
	}

	@Override
	public boolean isStalled() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setStallThreshold(int error, int time) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAcceleration(int acceleration) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void forward() throws RemoteException {
		L.info("Motor {}: running forward at speed {}", port, speed);
	}

	@Override
	public void backward() throws RemoteException {
		L.info("Motor {}: running backward at speed {}", port, speed);
	}

	@Override
	public void resetTachoCount() throws RemoteException {
	}

	@Override
	public int getTachoCount() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}
