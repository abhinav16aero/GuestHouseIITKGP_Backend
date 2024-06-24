package com.abhinav16aero.guesthouseiitkgp.service;

import com.abhinav16aero.guesthouseiitkgp.model.BookedRoom;

import java.util.List;

/**
 * @author Abhinav Kumar
 */

public interface IBookingService {
    void cancelBooking(Long bookingId);

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();

    List<BookedRoom> getBookingsByUserEmail(String email);
}
