package com.notification;

/**
 * Represents the time the Notification should be shown.
 */
public final class Time {
	private int m_milliseconds;
	private boolean m_infinite;

	private Time(int milliseconds, boolean infinite) {
		m_milliseconds = milliseconds;
		m_infinite = infinite;
	}

	protected int getMilliseconds() {
		return m_milliseconds;
	}

	protected boolean isInfinite() {
		return m_infinite;
	}

	/**
	 * @param seconds
	 *            the number of seconds the Notification should display. This is truncated at the millisecond.
	 * @return
	 */
	public static Time seconds(double seconds) {
		return new Time((int) (seconds * 1000), false);
	}

	/**
	 * @param milliseconds
	 *            the number of milliseconds the Notification should display.
	 * @return
	 */
	public static Time milliseconds(int milliseconds) {
		return new Time(milliseconds, false);
	}

	/**
	 * Specifies that the Notification should display infinitely.
	 * 
	 * @return
	 */
	public static Time infinite() {
		return new Time(-1, true);
	}
}