package chailei.com.qsbkapp.utils;

import chailei.com.qsbkapp.fragments.FindFragment;
import chailei.com.qsbkapp.fragments.MessageFragment;
import chailei.com.qsbkapp.fragments.QiuShiFragment;
import chailei.com.qsbkapp.fragments.QiuYouFragment;

/**
 * Created by Administrator on 16-1-2.
 */
public class InitFragment {

    private QiuShiFragment qiuShiFragment;
    private QiuYouFragment qiuYouFragment;
    private FindFragment findFragment;
    private MessageFragment messageFragment;

    public InitFragment() {
        qiuShiFragment = new QiuShiFragment();
        qiuYouFragment = new QiuYouFragment();
        findFragment = new FindFragment();
        messageFragment = new MessageFragment();
    }

    public QiuShiFragment getQiuShiFragment() {
        return qiuShiFragment;
    }

    public void setQiuShiFragment(QiuShiFragment qiuShiFragment) {
        this.qiuShiFragment = qiuShiFragment;
    }

    public QiuYouFragment getQiuYouFragment() {
        return qiuYouFragment;
    }

    public void setQiuYouFragment(QiuYouFragment qiuYouFragment) {
        this.qiuYouFragment = qiuYouFragment;
    }

    public FindFragment getFindFragment() {
        return findFragment;
    }

    public void setFindFragment(FindFragment findFragment) {
        this.findFragment = findFragment;
    }

    public MessageFragment getMessageFragment() {
        return messageFragment;
    }

    public void setMessageFragment(MessageFragment messageFragment) {
        this.messageFragment = messageFragment;
    }
}
