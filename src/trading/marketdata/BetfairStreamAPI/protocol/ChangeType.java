package trading.marketdata.BetfairStreamAPI.protocol;


public enum ChangeType {
	    /**
	     * Update
	     */
	    UPDATE,
	    /**
	     * Initial subscription image
	     **/
	    SUB_IMAGE,
	    /**
	     * Resubscription delta image
	     */
	    RESUB_DELTA,
	    /**
	     * Heartbeat
	     */
	    HEARTBEAT,
}

