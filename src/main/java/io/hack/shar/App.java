package io.hack.shar;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import java.io.IOException;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;


public class App {
    public static void main(String[] args) throws IOException, Exception {
     //   open("https://tinder.com");
     //   $(By.cssSelector("#content > div > div.App__body.H\\(100\\%\\).Pos\\(r\\).Z\\(0\\) > div > main > div.H\\(100\\%\\) > div > div > header > div.Expand.D\\(f\\).Ai\\(c\\).Jc\\(sb\\).BdB.Trsp\\(\\$border-color\\).Trstf\\(l\\).Bdc\\(t\\).Trsdu\\(0ms\\) > div.H\\(100\\%\\).D\\(f\\).Ai\\(c\\) > div > button > span")).click();
     //   $(By.cssSelector("#modal-manager > div > div > div > div > div:nth-child(4) > div:nth-child(2) > button > span")).click();
        open("https://www.facebook.com/");
        $(By.cssSelector("#email")).setValue("stcon@mail.ru");
        $(By.cssSelector("#pass")).setValue("hasoru71");
        $(By.cssSelector("#u_0_b")).click();
        open("https://tinder.com");
        $(By.cssSelector("#content > div > div.App__body.H\\(100\\%\\).Pos\\(r\\).Z\\(0\\) > div > main > div.H\\(100\\%\\) > div > div > header > div.Expand.D\\(f\\).Ai\\(c\\).Jc\\(sb\\).BdB.Trsp\\(\\$border-color\\).Trstf\\(l\\).Bdc\\(t\\).Trsdu\\(0ms\\) > div.H\\(100\\%\\).D\\(f\\).Ai\\(c\\) > div > button > span")).click();
        $(By.cssSelector("#modal-manager > div > div > div > div > div:nth-child(4) > div:nth-child(2) > button > span")).click();
        $(By.cssSelector("#modal-manager > div > div > div > div > div.Pb\\(24px\\).Px\\(24px\\).D\\(f\\).Fld\\(rr\\).Ai\\(st\\) > button.button.Lts\\(\\$ls-s\\).Z\\(0\\).CenterAlign.Mx\\(a\\).Cur\\(p\\).Tt\\(u\\).Ell.Bdrs\\(100px\\).Px\\(24px\\).Px\\(20px\\)--s.Py\\(0\\).Mih\\(40px\\).Pos\\(r\\).Ov\\(h\\).C\\(\\#fff\\).Bg\\(\\$c-pink\\)\\:h\\:\\:b.Bg\\(\\$c-pink\\)\\:f\\:\\:b.Bg\\(\\$c-pink\\)\\:a\\:\\:b.Trsdu\\(\\$fast\\).Trsp\\(\\$background\\).Bg\\(\\$primary-gradient\\).button--primary-shadow.StyledButton.Fw\\(\\$semibold\\).focus-button-style.W\\(225px\\).W\\(a\\) > span")).click();
        $(By.cssSelector("#modal-manager > div > div > div > div > div.Pb\\(24px\\).Px\\(24px\\).D\\(f\\).Fld\\(rr\\).Ai\\(st\\) > button.button.Lts\\(\\$ls-s\\).Z\\(0\\).CenterAlign.Mx\\(a\\).Cur\\(p\\).Tt\\(u\\).Ell.Bdrs\\(100px\\).Px\\(24px\\).Px\\(20px\\)--s.Py\\(0\\).Mih\\(40px\\).Pos\\(r\\).Ov\\(h\\).C\\(\\#fff\\).Bg\\(\\$c-pink\\)\\:h\\:\\:b.Bg\\(\\$c-pink\\)\\:f\\:\\:b.Bg\\(\\$c-pink\\)\\:a\\:\\:b.Trsdu\\(\\$fast\\).Trsp\\(\\$background\\).Bg\\(\\$primary-gradient\\).button--primary-shadow.StyledButton.Fw\\(\\$semibold\\).focus-button-style.W\\(225px\\).W\\(a\\) > span")).click();
        for (int i = 0; i < 1000; i++) {
            $(By.cssSelector("#content > div > div.App__body.H\\(100\\%\\).Pos\\(r\\).Z\\(0\\) > div > main > div.H\\(100\\%\\) > div > div > div.recsCardboard.W\\(100\\%\\).Mt\\(a\\).H\\(100\\%\\)--s.Px\\(10px\\)--s > div > div.recsGamepad.Pos\\(r\\).Py\\(16px\\).Px\\(6px\\).Px\\(8px\\)--ml.D\\(f\\).Jc\\(sa\\).Ai\\(c\\).Maw\\(375px\\)--m.Mx\\(a\\) > button.button.Lts\\(\\$ls-s\\).Z\\(0\\).CenterAlign.Mx\\(a\\).Cur\\(p\\).Tt\\(u\\).Bdrs\\(50\\%\\).P\\(0\\).Fw\\(\\$semibold\\).focus-button-style.recsGamepad__button.D\\(b\\).Bgc\\(\\#fff\\).Wc\\(\\$transform\\).End\\(15px\\).Scale\\(1\\.1\\)\\:h > span > svg > path")).click();
            //$(By.cssSelector("#modal-manager > div > div > div.Pt\\(16px\\).Pb\\(10px\\).Px\\(36px\\) > button.button.Lts\\(\\$ls-s\\).Z\\(0\\).CenterAlign.Mx\\(a\\).Cur\\(p\\).Tt\\(u\\).Ell.Bdrs\\(100px\\).Px\\(24px\\).Px\\(20px\\)--s.Py\\(0\\).Mih\\(42px\\)--s.Mih\\(50px\\)--ml.Fw\\(\\$semibold\\).focus-button-style.D\\(b\\).Mx\\(a\\).C\\(\\$c-secondary\\).C\\(\\$c-base\\)\\:h > span")).click();
            //new Timer().schedule(new LikeTimer(), 2000);
           // open("https://tinder.com/app/recs");
        }
    }
}
