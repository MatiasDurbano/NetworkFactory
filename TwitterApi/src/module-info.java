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
	
	uses com.RedSocial.Red;
	provides com.RedSocial.Red with com.Twitter.TwitterRedImpl;
	
}