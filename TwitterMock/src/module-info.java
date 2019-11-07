/**
 * 
 */
/**
 * @author Matias
 *
 */
module TwitterMock {
	exports com.TwitterMock;
	requires RedSocialInterface;
	uses com.RedSocial.Red;
	provides com.RedSocial.Red with com.TwitterMock.TwitterMockRedImpl;
	
}