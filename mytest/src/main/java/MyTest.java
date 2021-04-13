import cn.hutool.core.clone.CloneRuntimeException;
import cn.hutool.core.clone.Cloneable;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.ObjectUtil;
import com.google.common.collect.*;
import com.sun.deploy.util.StringUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MyTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//
//        List<String> collect = list.stream().skip(2).limit(2).collect(Collectors.toList());
////        System.out.println(collect);
//        int n = 3;
//        boolean[][] f = new boolean[n][n];
////        for (int i = 0; i < n; ++i) {
////            Arrays.fill(f[i], true);
////        }
//
//        for (int i = 0; i < f.length; i++) {
//            for (int j = 0; j < f[i].length; j++) {
//                System.out.println(f[i][j]);
//            }
//        }

//        Date date = new Date();
//        Cat cat = new Cat();
//        cat.setDate(date);
//        System.out.println(cat);
//
//        Cat clone = ObjectUtil.cloneByStream(cat);
//        System.out.println(clone);
//
//        date.setTime(11111111L);
//        System.out.println(cat);
//        System.out.println(clone);

//        int a = 1;
//        String aStr = Convert.toStr(a);
//        long[] b = {1, 2, 3, 4, 5, 6};
//        String bStr = Convert.toStr(b);
//        System.out.println(aStr);
//        System.out.println(bStr);
//        List<String> list = Arrays.asList(Convert.toStrArray(b));
//        System.out.println(list);
//
//        List<String> lists = Convert.toList(String.class, b);
//        System.out.println(lists);
//
//        System.out.println("------------------------------------------");
//        String date = "2017-05-06";
//        Date value = Convert.toDate(date);
//        System.out.println(value);

//        String a = "我不是乱码";
//        //转换后result为乱码
//        String result = Convert.convertCharset(a, CharsetUtil.UTF_8, CharsetUtil.ISO_8859_1);
//        String raw = Convert.convertCharset(result, CharsetUtil.ISO_8859_1, "UTF-8");
//        System.out.println(result);
//        System.out.println(raw);

//        BigDecimal a = new BigDecimal("67556.32");
//
//        //结果为："陆万柒仟伍佰伍拾陆元叁角贰分"
//        String digitUppercase = Convert.digitToChinese(a);
//        System.out.println(digitUppercase);


//        A a = new A("zl", "1", 18);
//        A a1 = new A("zl", "1", 18);
//        A a2 = new A("zh", "1", 16);
//        A a3 = new A("zqc", "1", 19);
//        List<A> list = new ArrayList<>();
//        list.add(a);
//        list.add(a1);
//        list.add(a2);
//        list.add(a3);
//        System.out.println(list);

//        list = list.stream().distinct().collect(Collectors.toList());
//
//        list = list.stream().collect(
//                Collectors.collectingAndThen(
//                        Collectors.toCollection(() -> new HashSet<>(Comparator.comparing(o -> o.getName() + ";" + o.getSex()))), ArrayList::new)
//        );

//        System.out.println(list);

//        Predicate<Integer> predicate = x -> x < 100;
//        predicate = predicate.and(x -> x > 10);
//        A a = new A("zl", "1", 8);
//        if (predicate.test(a.getAge())) {
//            System.out.println("zhebushi null");
//        }

//        if ("".equals(null)) {
//            System.out.println("ss");
//        }
//        ArrayList<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("1");
//        System.out.println(list);
//
//        Set<Integer> failData = new HashSet<>((List<Integer>)list.clone());
//        System.out.println(failData);

//        String str = "tets'ss'sdsds'hhhhh'";
//        String substring = str.substring(str.indexOf("'",1), str.indexOf("'", 2));
//        System.out.println(substring);
//        Long i = 10_000L;
//        String s = Optional.ofNullable(String.valueOf(i)).orElse("");
//        System.out.println(s.getClass());


//        try {
//            test();
//        } catch (Exception e) {
//            String message = e.getMessage();
//            System.out.println(message);
//        }

//        Integer i = 128;
//
//        Integer a = 128;
//
//        if (a == i) {
//            System.out.println("true");
//        }

//        String str = "asas/ll";
//        String s = str.substring(str.lastIndexOf("/") == -1 ? 0 : str.lastIndexOf("/") + 1);
//        System.out.println(s);

//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("4");
//        list.add("4");
//        list.add("4");
//        list.add("4");
//        list.add("4");
//
//        List<List<String>> lists = subList(list, 3);
//
//        System.out.println(lists);

        // 正则表达式 特殊符号
//        String str="判断的字 符串-中國?";
//        String regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
//        Pattern p=Pattern.compile(regEx);
//        Matcher m=p.matcher(str);
//        System.out.println(m.find());

//        String a = "1";
//        String b = "4";
//        String c = "6";
//
//        String concat = a.concat(b).concat(c);
//        System.out.println(concat);


//        String value = SealEnum.TYPE_COMPANY_SEAL.getValue();
//        System.out.println(value);


//        int second = LocalDateTime.now().getSecond();
//        LocalDateTime.now().get
//        try {
//            Thread.sleep(1_000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        int second1 = LocalDateTime.now().getSecond();
//        System.out.println(second1 - second);

//        AtomicBoolean flag = new AtomicBoolean(true);
//        AtomicInteger atomicInteger = new AtomicInteger(1);
//        System.out.println(flag.get());
//        int i = atomicInteger.get();
//        System.out.println(i);

//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("0");
//        list.add("1");
//        test(list);

//        List<String> list = new ArrayList<String>(){{
//            add("10");
//            add("20");
//            add("30");
//            add("40");
//        }};
//        System.out.println(list);
//        String s = list.get(0);
//        System.out.println(s);
//        list = Lists.reverse(list);
//        System.out.println(list);
//        String s1 = list.get(0);
//        System.out.println(s1);

//        ImmutableMap.of("1","1","2","2","3", "3", "4","4","5", "5");

//        Map<String,String> leftMap = ImmutableMap.of("1","1","2","2","3","3");
//        Map<String,String> rightMap = ImmutableMap.of("2","2","3","30","4","4");
//        MapDifference difference = Maps.difference(leftMap, rightMap);
//
//        System.out.println("左边 map 独有 key：" + difference.entriesOnlyOnLeft());
//        System.out.println("右边 map 独有 key：{}"+difference.entriesOnlyOnRight());
//        System.out.println("左右边 map 都有 key，并且 value 相等：{}"+difference.entriesInCommon());
//        System.out.println("左右边 map 都有 key，但 value 不等：{}"+difference.entriesDiffering());
//
//        Object o = difference.entriesDiffering().get("3");

//        List<String> list = ImmutableList.of("1", "2");

//        LocalDateTime localDateTime = LocalDateTime.of(2019, Month.DECEMBER, 13, 14, 53, 23);
//        System.out.println(localDateTime);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String format = dateTimeFormatter.format(localDateTime);
//        System.out.println(format);
//
//        LocalDateTime parse = LocalDateTime.parse(format, dateTimeFormatter);
//        System.out.println(parse);

        A a = new A("zl", "1",1);
        for (Class<?> anInterface : a.getClass().getInterfaces()) {
            System.out.println(anInterface);
        }


    }


    private static boolean test(List<String> list) {
        AtomicBoolean a = new AtomicBoolean(true);
        list.forEach(x -> {
            if (x.equals("0")) {
                a.set(false);
                return;
            }
        });
        return a.get();
    }

    public enum SealEnum {

        TYPE_TITLE("Title", 2, "抬头图"),
        TYPE_COMPANY_SEAL("Company_Seal", 3, "公司印章图"),
        TYPE_DOCTOR_SEAL_NAME("Doctor_Seal_Name", 4, "医生签名图");
        private String value;
        private Integer type;
        private String desc;


        SealEnum(String value, Integer type, String desc) {
            this.value = value;
            this.type = type;
            this.desc = desc;
        }

        public static Integer getType(String key) {
            for (SealEnum value : SealEnum.values()) {
                if (key.equals(value.getValue())) {
                    return value.getType();
                }
            }
            return null;
        }

        public static SealEnum getEnum(String value) {
            for (SealEnum sealEnum : SealEnum.values()) {
                if (sealEnum.getValue().equals(value)) {
                    return sealEnum;
                }
            }
            return TYPE_COMPANY_SEAL;
        }

        public String getValue() {
            return value;
        }

        public Integer getType() {
            return type;
        }

        public String getDesc() {
            return desc;
        }
    }

    private static <T> List<List<T>> subList(List<T> list, int length) {
        List<List<T>> lists = new ArrayList<>();
        int b = 0;
        int size = list.size();
        while (b < size) {
            lists.add(list.subList(b, (b += length) > size ? size : b));
        }
        return lists;
    }

    private static void test() throws Exception {
        throw new Exception("123333");
    }

    private static class Cat implements Cloneable<Cat>, Serializable {

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", date=" + date +
                    '}';
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        private String name = "miaomiao";
        private int age = 2;
        private Date date;

        @Override
        public Cat clone() {
            try {
                return (Cat) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new CloneRuntimeException(e);
            }
        }
    }
}
