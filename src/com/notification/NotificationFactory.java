package com.notification;

import javax.swing.ImageIcon;

import com.theme.ThemePackage;
import com.theme.ThemePackagePresets;

/**
 * Creates Notifications using a ThemePackage.
 */
public class NotificationFactory {
	private ThemePackage m_pack;

	public enum PopupLocation {
		NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST
	}

	public NotificationFactory() {
		setThemePackage(ThemePackagePresets.cleanLight());
	}

	public NotificationFactory(ThemePackage pack) {
		setThemePackage(pack);
	}

	/**
	 * Sets the themes that the factory should use when creating notifications. See ThemePackagePresets for some default
	 * themes.
	 * 
	 * @param pack
	 */
	public void setThemePackage(ThemePackage pack) {
		m_pack = pack;
	}

	/**
	 * Builds a SimpleTextNotification.
	 * 
	 * @param title
	 * @param subtitle
	 * @return
	 */
	public SimpleTextNotification buildTextNotification(String title, String subtitle) {
		SimpleTextNotification text = new SimpleTextNotification();
		text.setWindowTheme(m_pack.windowTheme);
		text.setTextTheme(m_pack.textTheme);
		text.setTitle(title);
		text.setSubtitle(subtitle);

		return text;
	}

	/**
	 * Builds an IconNotification.
	 * 
	 * @param title
	 * @param subtitle
	 * @param icon
	 * @return
	 */
	public IconNotification buildIconNotification(String title, String subtitle, ImageIcon icon) {
		IconNotification iconNote = new IconNotification(icon);
		iconNote.setWindowTheme(m_pack.windowTheme);
		iconNote.setTextTheme(m_pack.textTheme);
		iconNote.setTitle(title);
		iconNote.setSubtitle(subtitle);

		return iconNote;
	}
}