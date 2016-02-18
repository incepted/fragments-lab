package ly.generalassemb.drewmahrt.userinfotabs;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by drewmahrt on 2/18/16.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PicFragment tab1 = new PicFragment();
                return tab1;
            case 1:
                ContactInfo tab2 = new ContactInfo();
                return tab2;
                //TODO: Add your second tab
            case 2:
                UserInformation tab3 = new UserInformation();
                //TODO: Add your third tab
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
