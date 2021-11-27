package com.company.service;

import com.company.entity.User;
import com.company.enums.DismissalReason;

import java.lang.reflect.Field;

public class UserFactory<T extends User> {

    private int salaryFrom = 1000;
    private int salaryMax = 2500;

    public T getUser(T user) {
        Class<? extends User> aClass = user.getClass();
        rewritingFieldsClass(aClass, user);
        rewritingFildsSuperClass(aClass, user);
        return user;
    }

    private void rewritingFildsSuperClass(Class<? extends User> aClass, T user) {
        Field[] declaredFields = aClass.getSuperclass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            try {
                if (field.getType().equals(String.class))
                    field.set(user, "String");
                if (field.getType().equals(int.class))
                    field.set(user, (int) (Math.random() * salaryMax) + salaryFrom);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void rewritingFieldsClass(Class<? extends User> aClass, T user) {
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getType());
            try {
                if (field.getType().toString().contains("DismissalReason")) {
                    DismissalReason[] values = DismissalReason.values();
                    int i = (int) (Math.random() * values.length);
                    field.set(user, values[i]);
                }
                if (field.getType().toString().contains("Company")) {
                    Field[] declaredFields1 = field.getType().getDeclaredFields();
                    for (Field fild : declaredFields1) {
                        fild.setAccessible(true);
                        System.out.println(fild);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
