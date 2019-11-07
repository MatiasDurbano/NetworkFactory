/**
 * 
 */
/**
 * @author Matias
 *
 */
module FacebookMock {
	exports com.FacebookMock;
	requires RedSocialInterface;
	uses com.RedSocial.Red;
	provides com.RedSocial.Red with com.FacebookMock.FacebookRedImpl;
}