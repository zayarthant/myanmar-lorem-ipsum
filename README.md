# **myanmar-lorem-ipsum**
##### Dummy Text Generator for Myanmar

#####  About
English ဘာသာ Lorem ipsum စာများသည် ယေဘုယျအားဖြင့် pseudo-Latin စကားလုံးများဖြင့် ဖွဲ့စည်းထားခြင်းဖြစ်ပါသည်။ ဒီဇိုင်းများကို နမူနာပြသရန် နှင့် ဒီဇိုင်၏ အရည်အသွေးကို စမ်းစစ်ရန် အတွက် placeholder text အနေဖြင့် ကျယ်ပြန့်စွာ အသုံပြုလျှက်ရှိပါသည်။ စကားလုံးများတွင် အဓိပ္ပာယ် မရှိသည့်အားလျှောစွာ ဖတ်ရှုသူ အနေနဲ့ စာကို ဖတ်ရှုနေစရာ မလိုအပ်ပဲ ဒီဇိုင်းကို ပိုမို အာရုံစိုက်နိုင်ပါသည်။ ဘာသာစကား အသီးသီးတွင် Lorem ipsum များရှိသကဲ့သိုပင် ယခုမှာ မြန်မာ ဘာသာ အတွက် ဖြစ်ပါသည်။

ယခု စာမျက်နှာ သည် Lorem ipsum များကို မြန်မာ Version အနေနဲ့ ထုတ်ပေးထားခြင်းဖြစ်ပါသည်။ စာပိုဒ် (၅) ပိုဒ်ပါ၀င်ပြီး စာပိုဒ် တစ်ခုချင်းစီတွင် ၀ါကျ (၅) ခုမှ (၆) အထိပါ၀င်ပါသည်။ စာလုံးတိုင်းတွင် လူသုံးနည်းသော ပါဠိ စာတစ်၀က် နှင့် လူသုံးများသော မြန်မာစာ တစ်၀က် ပါ၀င် ပါသည်။ ပါ၀င်သော ပါဠိစာများသည် ပုံမှန် စာဖတ်သူများ အတွက် ဖတ်ရှုရန် ခက်ခဲသော စာများဖြစ်စေပါသည်။ pseudo-sentence စာများကို generate လုပ်သည့် အဆင့် တစ်ဆင့်စီကို အောက်ပါစာပိုဒ်တွင် ဖော်ပြထားပါသည်။

ပါဠိစာအမှန် (၁၂) ကြောင်း နှင့် မြန်မာ စာအမှန် (၁၂) ကြောင်း၏ ဝဏ္ဏ syllable များကို ကျပန်း ရောမွှေ ပါသည်။ အဆိုပါ ကျပန်း ဝဏ္ဏ (၂) လုံး မှ (၆) လုံးအထိကိုစုစည်းပြီး ကျပန်း ပုဒ်စု phrase ကိုရရှိပါသည်။ အဆိုပါ ပုဒ်စု (၃) ခုမှ (၉) ခုကို စုစည်းပြီး ၀ါကျ sentence များကို တည်ဆောက်ပါသည်။ ရလဒ်အနေနှင့် စာအမှန်နှင့် အမြင်တွင်လွန်စွာ ဆင်တူပြီး ဖတ်ရှုရန် မလွယ်သော ၀ါကျများကို ရရှိပါသည်။

- Inspiration from [Sylbreak](https://github.com/ye-kyaw-thu/sylbreak "Sylbreak") by [Ye Kyaw Thu](https://github.com/ye-kyaw-thu "Ye Kyaw Thu")
- Java sylbreak credit go to [Chan Mrate Ko Ko](https://github.com/chanmratekoko "Chan Mrate Ko Ko").

Contributors [Phyo Zaw Tun](https://github.com/phyozawtun "Phyo Zaw Tun") and [Zayar Shin Thant](https://github.com/zayarthant "Zayar Shin Thant")

အကြုံပေးလိုသည်နှင့် Bug များတွေ့ရှိပါက [Issue](https://github.com/zayarthant/myanmar-lorem-ipsum/issues "Issue") တင်ပေးပါ။

###### Apache Maven
```xml
<dependency>
  <groupId>com.mandalarsoft</groupId>
  <artifactId>myanmar-lorem-ipsum</artifactId>
  <version>1.0</version>
</dependency>
```

###### Gradle Groovy DSL

```groovy
implementation 'com.mandalarsoft:myanmar-lorem-ipsum:1.0'
```

###### More Dependency Managements - [Go To Maven Central](https://search.maven.org/artifact/com.mandalarsoft/myanmar-lorem-ipsum/1.0/jar "Maven Central")

###### Supported Languages

1. OFFICE - ရုံးစာ
2. GOV - အစိုးရနှင့်သက်ဆိုင်သော
3. PALI - ပါဠိ
4. SHAN - သျှမ်းစာ (ရှမ်း)

#### Quick Guide

Generating Dummey Text (resource name, paragraph)
```java
String result = DummyTextGenerator.get(Resources.SHAN, 1);
```

With Custorm raw data (string, paragraph)
```java
DummyText dummyText = new DummyText();
dummyText.generate("မြန်မာစာ ဖော်ပြမှု", 0);
```










