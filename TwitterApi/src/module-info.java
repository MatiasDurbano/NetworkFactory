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
	
	uses com.Network2.Red;
	provides com.Network2.Red with com.Twitter.TwitterRedImpl;
	
}