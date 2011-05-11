package edu.nyu.grouper.api;

import java.net.URL;

import org.apache.commons.httpclient.HttpClient;

public interface GrouperConfiguration {

	/**
	 * @return the Grouper WS version number to use.
	 */
	public abstract String getWsVersion();

	/**
	 * @return the username in Grouper
	 */
	public abstract String getUsername();

	/**
	 * @return the username's password in Grouper
	 */
	public abstract String getPassword();

	/**
	 * @return the stem where nakamura can write to
	 */
	public abstract String getBaseStem();
	
	/**
	 * http://localhost:9090/grouper-ws
	 * @return the {@link URL} of the Grouper WS
	 */
	public abstract URL getUrl();

	/**
	 * Useful for {@link HttpClient} connections.
	 * http://localhost:9090/grouper-ws/servicesRest
	 * @return a {@link String} representation of the url to the Grouper WS REST services.
	 */
	public abstract String getRestWsUrlString();

	/**
	 * When using Aggregate groups to manage institutional and nakamura ad-hoc data,
	 * append this string to the nakmura ad-hoc group names
	 * @return
	 */
	public abstract String getSuffix();

	/**
	 * How long to wait for an {@link HttpClient} request to fail.
	 * @return
	 */
	public abstract int getHttpTimeout();

	/**
	 * Don't process events generated by this user.
	 * Prevents the dreaded "event-loop" where we keep informing Grouper of something it just did.
	 * @return the userId to ignore.
	 */
	public abstract String getIgnoredUserId();
}