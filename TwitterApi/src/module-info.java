/**
 * 
 */
/**
 * @author Matias
 *
 */
module TwitterApi {
	exports com.Twitter;
	requires RedSocialInterface;
	requires Properties;
	requires org.twitter4j.core;
	
	uses com.Network.Red;
	provides com.Network.Red with com.Twitter.TwitterRedImpl;
	
}