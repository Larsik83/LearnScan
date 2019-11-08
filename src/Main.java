

public class Main {
    public static void main(String[] args) {
        String[] roles = {"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы" +
                " сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука: Господи боже! еще и с секретным предписаньем!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем! Лука Лукич:",
                "Лука Лукич: "};


        printTextPerRole(roles, textLines);


    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder a1 = new StringBuilder();
        String a = "1";
//цикл городничий
        for (int i = 0; i < roles.length; i++) {

            if (textLines[i].startsWith(roles[i])) {

                for (int j = 0; j < roles.length; j++) {

                    if (textLines[j].startsWith(roles[j])) {
                        a1.append(textLines[i]);
                    }
                    System.out.println(textLines[j]);
                }


            }
        }




        return a;


    }
}




