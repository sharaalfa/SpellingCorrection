package io.hack.shar;

import org.openqa.selenium.By;

import java.util.TimerTask;

import static com.codeborne.selenide.Selenide.$;

public class LikeTimer extends TimerTask {
    @Override
    public void run() {
        //$(By.cssSelector("#content > div > div.App__body.H\\(100\\%\\).Pos\\(r\\).Z\\(0\\) > div > main > div.H\\(100\\%\\) > div > div > div.recsCardboard.W\\(100\\%\\).Mt\\(a\\).H\\(100\\%\\)--s.Px\\(10px\\)--s > div > div.recsGamepad.Pos\\(r\\).Py\\(16px\\).Px\\(6px\\).Px\\(8px\\)--ml.D\\(f\\).Jc\\(sa\\).Ai\\(c\\).Maw\\(375px\\)--m.Mx\\(a\\) > button.button.Lts\\(\\$ls-s\\).Z\\(0\\).CenterAlign.Mx\\(a\\).Cur\\(p\\).Tt\\(u\\).Bdrs\\(50\\%\\).P\\(0\\).Fw\\(\\$semibold\\).focus-button-style.recsGamepad__button.D\\(b\\).Bgc\\(\\#fff\\).Wc\\(\\$transform\\).End\\(15px\\).Scale\\(1\\.1\\)\\:h > span > svg > path")).click();
    }
}
