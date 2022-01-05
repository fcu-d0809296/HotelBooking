package com.hb.controller;

import com.hb.exception.NotFoundException;
import com.hb.model.Hotel;
import com.hb.model.Room;
import com.hb.model.User;
import com.hb.service.HotelService;
import com.hb.service.RoomService;
import com.hb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @Autowired
    private RoomService roomService;

    @GetMapping("/home")
    public String showHome(Model model) {
//        List<User> listUsers = service.listAll();
//        model.addAttribute("listUsers", listUsers);
        return "Home";
    }
    @GetMapping("/hotel-list-test")
    public String showHotels(Model model) {
        List<Hotel> listHotels = hotelService.listHotels();
        model.addAttribute("listHotels",listHotels);
        return "hotel-list-test";
    }
    @GetMapping("/hotel-{location}-test")
    public String showTaipei(Model model,@PathVariable("location") String location){
        List<Hotel> listLocationHotel = hotelService.listHotelsByLocation(location);
        model.addAttribute("listHotels",listLocationHotel);
        return "hotel-list-test";

    }
    @GetMapping("/test")
    public String test(Model model) {
        List<Hotel> listHotels = hotelService.listHotels();
        model.addAttribute("listHotels",listHotels);
        return "test";
    }

    @GetMapping("/order")
    public String showBooked(Model model) {
        List<Room> listHotels = roomService.listState1();
        model.addAttribute("listHotel",listHotels);
        return "Order";
    }
//    @GetMapping("/users/edit/{id}")
//    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
//        try {
//            User user = service.get(id);
//            model.addAttribute("user", user);
//            model.addAttribute("pageTitle", "Edit User (ID: " + id + ")");
//
//            return "user_from";
//        } catch (NotFoundException e) {
//            ra.addFlashAttribute("message", e.getMessage());
//            return "redirect:/users";
//        }
//    }
}



