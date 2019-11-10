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
	uses com.RedSocial.Network;
	provides com.RedSocial.Network with com.TwitterMock.TwitterMockRedImpl;
	
}