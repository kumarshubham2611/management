/*
 * package com.management.controller;
 * 
 * import org.apache.logging.log4j.Logger;
 * 
 * import java.util.List;
 * 
 * import org.apache.logging.log4j.LogManager; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * import com.management.entity.User; import com.management.service.UserService;
 * 
 * @Controller
 * 
 * @RequestMapping("/users") public class UserController {
 * 
 * private static final Logger LOGGER =
 * LogManager.getLogger(UserController.class);
 * 
 * private UserService userService;
 * 
 * @Autowired public UserController(UserService userService) { this.userService
 * = userService; }
 * 
 * 
 * @PostMapping("/register") public String createUser(@RequestParam("email")
 * String email, @RequestParam("name") String name,
 * 
 * @RequestParam("password") String password) { User user = new User();
 * user.setEmail(email); user.setUsername(name); user.setPassword(password);
 * 
 * userService.createUser(user);
 * 
 * return "redirect:/users"; }
 * 
 * public String createUser(@ModelAttribute User user) {
 * 
 * return "redirect:/users"; }
 * 
 * 
 * @PostMapping public String createUser(@RequestBody User user) {
 * userService.createUser(user); return "/users"; }
 * 
 * 
 * 
 * 
 * 
 * 
 * @PostMapping("/register") public ResponseEntity<String>
 * createUser(@RequestBody @PathVariable Long id, User user) {
 * userService.createUser(user); LOGGER.info(user); return
 * ResponseEntity.ok("User created successfully"); }
 * 
 * 
 * 
 * @GetMapping public ResponseEntity<List<User>> getAllUsers() { List<User>
 * users = userService.getAllUsers(); return ResponseEntity.ok(users); }
 * 
 * 
 * // json
 * 
 * 
 * 
 * { "password": "pass", "username": "new", "email": "hellloe@email.com",
 * "role": "admin"
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * @PostMapping("/register") public String createUser(User user) { // Logic to
 * create a new user userService.createUser(user); return "redirect:/users"; }
 * 
 * 
 * 
 * @GetMapping("/login") public String showLoginForm() { return "login"; }
 * 
 * @PostMapping("/login") public String login(@RequestParam String
 * username, @RequestParam String password, @RequestParam String role) {
 * 
 * if (role.equals("admin")) {
 * 
 * return "redirect:/admin/dashboard"; } else if (role.equals("customer")) {
 * 
 * return "redirect:/customer/dashboard"; } else {
 * 
 * return "redirect:/users/login"; } }
 * 
 * @GetMapping("/admin/dashboard") public String showAdminDashboard() {
 * 
 * return "adminDashboard"; }
 * 
 * @GetMapping("/customer/dashboard") public String showCustomerDashboard() {
 * 
 * return "customerDashboard"; }
 * 
 * @GetMapping("/manageRoles") public String showManageRoles() {
 * 
 * return "manageRoles"; }
 * 
 * @GetMapping("/managePermissions") public String showManagePermissions() {
 * 
 * return "managePermissions"; }
 * 
 * @GetMapping("/loginHistory") public String showLoginHistory() {
 * 
 * return "loginHistory"; }
 * 
 * @GetMapping("/{id}") public String getUserById(@PathVariable Long id, Model
 * model) { User user = userService.getUserById(id); model.addAttribute("user",
 * user); return "userDetails"; }
 * 
 * @GetMapping("/{id}/edit") public String showEditUserForm(@PathVariable Long
 * id, Model model) { User user = userService.getUserById(id);
 * model.addAttribute("user", user); return "editUser"; }
 * 
 * @PostMapping("/{id}/update") public String updateUser(@PathVariable Long id,
 * User updatedUser) { userService.updateUser(id, updatedUser); return
 * "redirect:/users/{id}"; }
 * 
 * @DeleteMapping("/{id}/delete") public String deleteUser(@PathVariable Long
 * id) { userService.deleteUser(id); return "redirect:/users"; } }
 */