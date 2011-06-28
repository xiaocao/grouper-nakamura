package org.sakaiproject.nakamura.grouper.event;

import javax.jms.JMSException;

import org.apache.solr.client.solrj.SolrServerException;

public interface BatchOperationsManager {

	/**
	 * Cause all group and course information to be sent to Grouper
	 * @throws SolrServerException
	 * @throws JMSException
	 */
	public abstract void doGroups() throws SolrServerException, JMSException;

	/**
	 * Cause all contact information to be sent to Grouper
	 * @throws SolrServerException
	 * @throws JMSException
	 */
	public abstract void doContacts() throws SolrServerException, JMSException;

}